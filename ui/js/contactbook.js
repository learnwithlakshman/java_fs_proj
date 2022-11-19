const baseUrl = 'https://cit-contact-book-api.herokuapp.com/api/v1/contact';

const showcontacts = document.querySelector('#showcontacts');
const searchstr = document.querySelector("#searchstr");

function showContacts(contacts) {
    let str = '<table class="table table-striped">';
    str += "<thead><tr><th>Name</th><th>Email</th><th>Mobile</th><th>City</th><th>Edit|Delete</th></tr></thead>";
    str += "<tbody>";
    for (let i = 0; i < contacts.length; i++) {
        let contact = contacts[i];
        str += `<tr>
                      <td>${contact.name}</td>
                      <td>${contact.email}</td>
                      <td>${contact.mobile}</td>
                      <td>${contact.city}</td>
                      <td><i class="fa fa-edit">&nbsp;&nbsp;</i><i class="fa fa-trash" onclick=deleteContact('${JSON.stringify(contact)}')></i></td>
                   </tr>`;
    }
    str += "</tbody>";
    str += "</table>";
    showcontacts.innerHTML = str;
}

function init() {

    fetch(`${baseUrl}/all`)
        .then(json => json.json())
        .then(res => {
            showContacts(res);
        }).catch(error => {
            console.log(error);
        });

}

searchstr.addEventListener("keyup", (event) => {
    let value = event.target.value;
    fetch(`${baseUrl}/search?str=${value}`)
        .then(json => json.json())
        .then(res => {
            showContacts(res);
        }).catch(error => {
            console.log(error);
        });

})

function saveContact() {
    const formContact = document.querySelector("#formContact");
    let contact = {
        "name": formContact.name.value,
        "email": formContact.email.value,
        "mobile": formContact.mobile.value,
        "city": formContact.city.value,
    }
  
    fetch(baseUrl,
        {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(contact)
        }
       
    ).then(res => res.json())
        .then(data => {
            formContact.reset();
            init();
            document.querySelector(".btn-close").click();
        })
   
}
function deleteContact(contact){
    let c = JSON.parse(contact);
    if(confirm(`Are you do you want to delete ${c.name} ?`)){
         fetch(`${baseUrl}/${c.id}`,{
            method:'DELETE'
         }).then(res=>{
            init();
         })   
    }
}
init();
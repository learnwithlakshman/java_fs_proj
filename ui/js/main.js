const countryId=document.querySelector("#country");
const id_country_search_result = document.querySelector("#id_country_search_result");
var countries=[];

fetch("json/countries.json").then(json=>json.json())
    .then(res=>{
       countries = res;
});

fetch("http://localhost:8080/api/v1/contact/all").then(json=>json.json()).then(res=>{
        console.log(res);
})

countryId.addEventListener('keyup',(event)=>{
        
    if(event.keyCode==13 && countryId.value!=""){
           searchName = countryId.value;
           searchCountry(searchName);
    }
})

function searchCountry(str){
    let matchedCountries = [];
    for(let i=0;i<countries.length;i++){
        if(countries[i].name.toLowerCase().includes(str.toLowerCase())){
            matchedCountries.push(countries[i]);
        }
    }
    if(matchedCountries.length==0){
        id_country_search_result.innerHTML = "No data found for the given search string";
    }else{
        let str = '';
        for(let i=0;i<matchedCountries.length;i++){
            let country = matchedCountries[i];
            str +=`<div class="card">
            <div class="card-body">
              Name: ${country.name} <br>Capital: ${country.capital} <br>
              <div style='text-align:right'><a onclick='showStates(${JSON.stringify(country)})' class='btn btn-primary'>More...</a></div>
            </div>
          </div>`
        }
        id_country_search_result.innerHTML= str;
    }

}
function showStates(country){
    console.log("",country.name);
    let str = '';
    str +=`<div class="card">
    <div class="card-body">
      Name: ${country.name} <br>Capital: ${country.capital} <br>
    </div>
  </div>`
  id_country_search_result.innerHTML= str;
  // state information

}

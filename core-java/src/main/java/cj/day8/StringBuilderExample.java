package cj.day8;

public class StringBuilderExample {
    public static void main(String[] args) {


        String[] names = new String[]{"Krish", "Manoj", "Charan", "Kiran"};


        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("Welcome message");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h3>Hello %s,</h3>");
        sb.append("<p>Welcome to java world, learning java is fun!</p>");
        sb.append("</body>");
        sb.append("</html>");

        for(String name:names){
            String message = String.format(sb.toString(),name);
            System.out.println(message);
            System.out.println("-".repeat(100));
        }

        StringBuilder sb2 = new StringBuilder("Krish");
        StringBuilder sb3 = new StringBuilder("Krish");
        System.out.println(sb2 == sb3);
        System.out.println(sb2.equals(sb3));
    }
}

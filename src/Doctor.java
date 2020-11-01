public class Doctor {
    // Atributos o Propiedades
    static int id = 0; //Autoincrement - Convert this class to Static
    String name;
    String email;
    String speciality;

    // Método constructor
    //sobre carga de métodos y valores
    Doctor(){
        System.out.println("Aquí se construye el objeto doctor");
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos "Métodos o funciones"
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println(id);
    }

    public void showSpeciality(){
        System.out.println(speciality);
    }

}

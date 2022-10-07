public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    /* Metodos Constructores */
    fecha(){
        dia = 0;
        mes = 0;
        anio = 0;
    }

    fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }




    /* Getter */
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }


    /* Setter */

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    /* Metodos */
    public boolean fechaCorrecta(){
        
        if (dia < 0  ||  dia >= 31) {
            return false;   

        }else if (mes < 0 || mes > 12){
            return false;

        }else if (anio < 0 || anio > 2023){
            return false;

        }else{
             return true;
        }   
    }



    private boolean esBisiesto(){
        
        if((anio %4 == 0) && (anio %100 != 0) || (anio %400 == 0)){
		
			return true;
        }else{
			return false;
        }
	}
      
    
    public boolean diaSiguiente(){

        if (esBisiesto == true && mes == 2 && dia == 29) {
            mes = mes + 1;
            dia = 1;

        }else if (esBisiesto == false && mes == 2 && dia == 28){
            mes = mes + 1;
            dia = 1;

        }else if (mes == 12 && dia == 31) {
            mes = 1;
            dia = 1;
        }
	}
    

    /* Metodo ToString */

    public String ToString(){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String resultado = this.fecha.format(dtf);
        return(resultado);
    
    }
}
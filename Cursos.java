public class Cursos {
      private String cursos;
    private double tiempo; 
    private String trabajos;
    private String examenes;
    public Cursos(String cursos, double tiempo, String trabajos, String examenes) {
        this.cursos = cursos;
        this.tiempo = tiempo;
        this.trabajos = trabajos;
        this.examenes = examenes;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(String trabajos) {
        this.trabajos = trabajos;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }
      public void Crearcurso(){
      }
}


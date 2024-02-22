
package quiz2_colegiado;


public class Quiz2_colegiado {

    
    public static void main(String[] args) {
        lista Cancion = new lista();
        Cancion.setIdCancion("79829");
        Cancion.setTitulo("La flaca");
        Cancion.setDuracion("4:18");
        Cancion.setAutor("jarabe de palo");
        Cancion.setAño("1996\n\n");
        
        System.out.println(Cancion.getIdCancion());
        System.out.println(Cancion.getTitulo());
        System.out.println(Cancion.getDuracion());
        System.out.println(Cancion.getAutor());
        System.out.println(Cancion.getAño());
        
        lista Cancion2 = new lista();
        Cancion2.setIdCancion("65820");
        Cancion2.setTitulo("Fanky");
        Cancion2.setDuracion("4:46");
        Cancion2.setAutor("Charly Garcia");
        Cancion2.setAño("1989");
        
       System.out.println(Cancion2.getIdCancion());
        System.out.println(Cancion2.getTitulo());
        System.out.println(Cancion2.getDuracion());
        System.out.println(Cancion2.getAutor());
        System.out.println(Cancion2.getAño());
        
    }
    

}

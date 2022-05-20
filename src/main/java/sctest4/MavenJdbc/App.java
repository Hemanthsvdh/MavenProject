package sctest4.MavenJdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentDao s= new StudentDao();
        Student std=new Student();
        std.setId(1);
        std.setName("tom");
        std.setPhone(76543);
        s.saveStudent(std);
    }
}

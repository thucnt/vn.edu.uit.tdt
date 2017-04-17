import domain.Author;
import domain.Paper;
import org.neo4j.example.northwind.*;
import org.neo4j.example.northwind.repository.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.AuthorRepository;
import repository.PaperRepository;

/**
 * Created by thucnt on 12/26/16.
 */
public class Main {
    public static void main(String[] args){
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);

        listPapers(ctx.getBean(PaperRepository.class));
        //listAuthors(ctx.getBean(AuthorRepository.class));
    }

    public static void listAuthors(final AuthorRepository authorRepository){
        authorRepository.findAllLimit100();
        System.out.println("Successfully");
        for (final Author a : authorRepository.findAllLimit100()) {
            System.out.println("Author: " + a.getIdAuthor());
        }
    }

    public static void listPapers(final PaperRepository paperRepository) {
        for (final Paper p : paperRepository.findAllLimit100()) {
            //System.out.println("Paper: " + p.getIdPaper());
            if (p.getPaperList() != null){
                System.out.println("Paper: " + p.getIdPaper());
                for (Paper cp : p.getPaperList()) {
                    System.out.println("  Cited Paper: " + cp.getIdPaper());
                }
            }
        }
    }
}

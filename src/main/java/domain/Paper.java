package domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

/**
 * Created by thucnt on 12/26/16.
 */
public class Paper {
    @GraphId
    public Long id;

    private String idPaper;
    private String year;
    private  String title;
    @Relationship(type = "CITING", direction = Relationship.OUTGOING)
    private Set<Paper> paperList;
    @Relationship(type = "WRITING", direction = Relationship.INCOMING)
    private Set<Author> authorList;

    public Paper(){

    }

    public Paper(String idPaper, String year, String title, Set<Paper> paperList, Set<Author> authorList) {
        this.idPaper = idPaper;
        this.year = year;
        this.title = title;
        this.paperList = paperList;
        this.authorList = authorList;
    }

    public String getIdPaper() {
        return idPaper;
    }

    public void setIdPaper(String idPaper) {
        this.idPaper = idPaper;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Paper> getPaperList() {
        return paperList;
    }

    public void setPaperList(Set<Paper> paperList) {
        this.paperList = paperList;
    }

    public Set<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(Set<Author> authorList) {
        this.authorList = authorList;
    }
}

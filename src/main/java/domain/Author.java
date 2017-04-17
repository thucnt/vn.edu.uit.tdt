package domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

/**
 * Created by thucnt on 12/26/16.
 */
public class Author {
    @GraphId
    public Long id;

    private String name;
    private String idAuthor;

    @Relationship(type = "WRITING", direction = Relationship.OUTGOING)
    private Set<Paper> paperList;

    public Author(){

    }
    public Author(String name, String idAuthor, Set<Paper> paperList) {
        this.name = name;
        this.idAuthor = idAuthor;
        this.paperList = paperList;
    }

    public Set<Paper> getPaperList() {
        return paperList;
    }

    public void setPaperList(Set<Paper> paperList) {
        this.paperList = paperList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }
}

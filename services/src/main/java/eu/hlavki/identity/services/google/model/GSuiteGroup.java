package eu.hlavki.identity.services.google.model;

import eu.hlavki.identity.services.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GSuiteGroup {

    private String kind;
    private String id;
    private String etag;
    private String email;
    private String name;
    private Long directMembersCount;
    private String description;
    private Boolean adminCreated;
    private List<String> aliases;
    private List<String> nonEditableAliases;


    public GSuiteGroup() {
    }


    public String getKind() {
        return kind;
    }


    public void setKind(String kind) {
        this.kind = kind;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getEtag() {
        return etag;
    }


    public void setEtag(String etag) {
        this.etag = etag;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Long getDirectMembersCount() {
        return directMembersCount;
    }


    public void setDirectMembersCount(Long directMembersCount) {
        this.directMembersCount = directMembersCount;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Boolean getAdminCreated() {
        return adminCreated;
    }


    public void setAdminCreated(Boolean adminCreated) {
        this.adminCreated = adminCreated;
    }


    public List<String> getAliases() {
        if (aliases == null) {
            aliases = new ArrayList<>();
        }
        return aliases;
    }


    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }


    public List<String> getNonEditableAliases() {
        if (nonEditableAliases == null) {
            nonEditableAliases = new ArrayList<>();
        }
        return nonEditableAliases;
    }


    public void setNonEditableAliases(List<String> nonEditableAliases) {
        this.nonEditableAliases = nonEditableAliases;
    }


    @Override
    public String toString() {
        return StringUtils.toStringLine(this);
    }
}

public class Bird {
    private String id;
    private String name;
    private String description;
    private String imageUrl;

    public Bird(String id, String name, String description, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public boolean setId(String id) {
        if (id != null && id != "") {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setName(String name) {
        if (name != null && name != "") {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setDescription(String description) {
        if (description != null && description != "") {
            this.description = description;
            return true;
        }
        return false;
    }

    public boolean setImageUrl(String url) {
        if (url != null && url != "") {
            this.imageUrl = url;
            return true;
        }
        return false;
    }

    public String toString() {
        return "id: " + id + "\nname: " + name + "\ndescription: " + description + "\nimageUrl: " + imageUrl;
    }
}

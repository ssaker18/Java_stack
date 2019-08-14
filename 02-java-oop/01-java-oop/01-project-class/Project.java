class Project {
    private String name;
    private String description;

    public Project() {
        this.name = "empty";
        this.description = "empty";
    }

    public Project(String name) {
        this.name = name;
        this.description = "empty";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String elevatorPitch() {
        return this.name + "," + this.description;
    }
}
package utils;

public enum Sex {
    FEMALE("Самка"),
    MALE("Самец"),
    NON_BINARY("Небинарная гендорная персона");

    private String title;

    Sex(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

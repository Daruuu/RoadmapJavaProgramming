package topic6_databases.p1;

public class MediaType {
    private int mediaTpeID;
    private String name;

    public MediaType() {
    }

    public MediaType(int mediaTpeID, String name) {
        this.mediaTpeID = mediaTpeID;
        this.name = name;
    }

    public int getMediaTpeID() {
        return mediaTpeID;
    }

    public void setMediaTpeID(int mediaTpeID) {
        this.mediaTpeID = mediaTpeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MediaType{" +
                "mediaTpeID=" + mediaTpeID +
                ", name='" + name + '\'' +
                '}';
    }
}

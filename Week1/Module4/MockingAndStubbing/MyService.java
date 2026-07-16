package Week1.Module4.MockingAndStubbing;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void storeData() {
        api.saveData();
    }
}

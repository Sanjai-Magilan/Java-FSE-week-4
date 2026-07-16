package Week1.Module4.MockingAndStubbing;

public class MyDeleteService {
    private ExternalDeleteApi api;

    public MyDeleteService(ExternalDeleteApi api) {
        this.api = api;
    }

    public void removeData() {
        api.deleteData();
    }
}

package Week1.Module4.AdvancedMockito;

import Week1.Module4.MockingAndStubbing.ExternalApi;

public class Service {
    private Repository api;

    public Service(Repository api) {
        this.api = api;
    }

    public String processData() {
        return api.getData();
    }
}

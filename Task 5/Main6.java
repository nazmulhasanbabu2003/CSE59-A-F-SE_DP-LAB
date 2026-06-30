interface HttpService {
    void handleHttpRequest();
}

interface DatabaseManager {
    void executeSqlStatement();
}

interface ContainerOps {
    void restartDockerContainer();
}

class WebController implements HttpService {

    @Override
    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}

class DatabaseService implements DatabaseManager {

    @Override
    public void executeSqlStatement() {
        System.out.println("Executing SQL statement.");
    }
}

class DockerService implements ContainerOps {

    @Override
    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}

public class task6 {
    public static void main(String[] args) {

        WebController controller = new WebController();
        controller.handleHttpRequest();

        DatabaseService db = new DatabaseService();
        db.executeSqlStatement();

        DockerService docker = new DockerService();
        docker.restartDockerContainer();
    }
}

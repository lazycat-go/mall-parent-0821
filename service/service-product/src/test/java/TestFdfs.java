import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import java.io.IOException;

public class TestFdfs {

    public static void main(String[] args) throws IOException, MyException {

        String path = TestFdfs.class.getClassLoader().getResource("tracker.conf").getPath();

        System.out.println(path);

        ClientGlobal.init(path);

        // 获得tracker连接
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer connection = trackerClient.getConnection();

        // 通过tracker获得storage
        StorageClient storageClient = new StorageClient(connection,null);

        // 上传文件
        String[] jpgs = storageClient.upload_file("C:\\Users\\91589\\Downloads\\图片\\123.jpeg", "jpg", null);

        // 返回url
        for (String jpg : jpgs) {
            System.out.println(jpg);
        }

    }
}

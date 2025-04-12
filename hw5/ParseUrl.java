public class ParseUrl {
    String protocol;
    String host;
    String path;
    String filename;
    String query;

    public void parse(String urlString) {
        // 解析協定 (protocol)
        int protocolEnd = urlString.indexOf("://");
        protocol = urlString.substring(0, protocolEnd);

        // 解析主機名稱 (host)
        int hostStart = protocolEnd + 3; // 跳過 "://"
        int hostEnd = urlString.indexOf("/", hostStart);
        host = urlString.substring(hostStart, hostEnd);

        // 解析查詢資訊 (query)
        int queryStart = urlString.indexOf("?");
        int fragmentStart = urlString.indexOf("#");
        if (queryStart != -1) {
            if (fragmentStart != -1) {
                query = urlString.substring(queryStart + 1, fragmentStart);
            } else {
                query = urlString.substring(queryStart + 1);
            }
        } else {
            query = "";
        }

        // 解析路徑名稱 (path) 和檔案名稱 (filename)
        int pathStart = hostEnd;
        int fileStart = urlString.lastIndexOf("/");
        if (queryStart != -1) {
            path = urlString.substring(pathStart, fileStart + 1);
            filename = urlString.substring(fileStart + 1, queryStart);
        } else if (fragmentStart != -1) {
            path = urlString.substring(pathStart, fileStart + 1);
            filename = urlString.substring(fileStart + 1, fragmentStart);
        } else {
            path = urlString.substring(pathStart, fileStart + 1);
            filename = urlString.substring(fileStart + 1);
        }
    }

    public String toString() {
        return "protocol: " + protocol + "\n" +
               "host: " + host + "\n" +
               "path: " + path + "\n" +
               "filename: " + filename + "\n" +
               "query: " + query;
    }
}
package io.github.biezhi.java8.features;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class Java7File {

    public void jdk6ReadTxt() {
        BufferedReader br = null;
        try {
            new BufferedReader(new FileReader("file.txt"));
            StringBuilder sb   = new StringBuilder();
            String        line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createPath() {
        Path path1 = Paths.get("/home/biezhi", "a.txt");
        Path path2 = Paths.get("/home/biezhi/a.txt");

        URI  u       = URI.create("file:////home/biezhi/a.txt");
        Path pathURI = Paths.get(u);

        Path filePath = FileSystems.getDefault().getPath("/home/biezhi", "a.txt");

        File file = new File("/home/biezhi/a.txt");
        Path p1   = file.toPath();
        p1.toFile();
        file.toURI();

    }

    public void jdk7ReadFile() throws IOException {
        byte[] data    = Files.readAllBytes(Paths.get("/home/biezhi/a.txt"));
        String content = new String(data, StandardCharsets.UTF_8);

        List<String> lines = Files.readAllLines(Paths.get("/home/biezhi/a.txt"));
    }

    public void jdk7WriteFile() throws IOException {
        Files.write(Paths.get("/home/biezhi/b.txt"), "Hello JDK7!".getBytes());
        Files.write(Paths.get("/home/biezhi/b.txt"), "Hello JDK7!".getBytes(), StandardOpenOption.APPEND);
    }

    public void jdk7FilesMethods() throws IOException {
        Path         path   = Paths.get("path");
        InputStream  ins    = Files.newInputStream(path);
        OutputStream ops    = Files.newOutputStream(path);
        Reader       reader = Files.newBufferedReader(path);
        Writer       writer = Files.newBufferedWriter(path);

        InputStream in = new FileInputStream("");
        Files.copy(in, path);
        Files.move(path, path);
    }

    public void jdk7Create() throws IOException {
        Path path = Paths.get("path");
        if (!Files.exists(path)) {
            Files.createFile(path);
            Files.createDirectory(path);
        }
    }

    public void jdk7CreateTemp() throws IOException{
        Path dir = null;
        String prefix = null;
        String suffix = null;

        Files.createTempFile(dir, prefix, suffix);
        Files.createTempFile(prefix, suffix);
        Files.createTempDirectory(dir, prefix);
        Files.createTempDirectory(prefix);
    }

}

package com.example.demo.utils;

import java.io.*;

public class FileRead {

    public static void main(String[] args) {

//        String files = "D:\\12";
        String newFile = "D:\\code\\euronet-cup\\src\\main\\resources\\new.txt";
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newFile), "UTF-8"))) {
            File[] files = new File("D:\\12").listFiles();
            for (File file : files) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GBK"))) {
                    String line;
                    String delimiter = ",";
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(delimiter);
                        // 处理每一行数据
                        if(values.length>16) {
                            if (values[15].contains("440500")) {
                                writer.write(line);
                                writer.newLine();
                            }
                        }


                    }
                } catch (IOException e) {
                    System.err.println("读取文件 " + file.getAbsolutePath() + " 时出错: " + e.getMessage());
                }
            }
            System.out.println("符合条件的内容已写入到 " + newFile);



//            Files.list(Paths.get(files)).forEach(filePath ->{
//                if(Files.isRegularFile(filePath)) {
//                    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath.toFile()), "GBK"))){
//                        String line;
//                        String delimiter = ",";
//                        while ((line = br.readLine()) != null) {
//                            // 使用分隔符分割每一行
//                            String[] values = line.split(delimiter);
//                            // 处理每一行数据
//                            if(values[15].contains("440500")) {
//                                writer.write(line);
//                                writer.newLine();
//                            }
//
//                        }
//                    } catch (IOException e) {
//                        System.err.println("读取文件 " + filePath + " 时出错: " + e.getMessage());
//                        System.out.println(e.getMessage());
//                        e.printStackTrace();
//                    }
//                }
//            });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

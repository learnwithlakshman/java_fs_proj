package com.careerit.jdbc.bulk;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class CsvReaderUtil {
    private static final String fileName = "/app_user.csv";
    private CsvReaderUtil(){

    }
    public static List<AppUser> loadFromFile(){
        List<AppUser> list = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(CsvReaderUtil.class.getResource(fileName).toURI()));
            list.addAll(lines.stream().skip(1).map(line->convertToUser(line)).collect(Collectors.toList()));
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    private static AppUser convertToUser(String line) {
            String[] arr = line.split(",");
            AppUser obj = new AppUser();
            obj.setId(Long.parseLong(arr[0]));
            obj.setName(arr[1]);
            obj.setCountry(arr[2]);
            obj.setSalary(Double.parseDouble(arr[3]));
            obj.setGender(arr[4]);
            return obj;
    }

}

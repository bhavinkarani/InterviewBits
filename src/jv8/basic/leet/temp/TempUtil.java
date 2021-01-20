package nl.ing.api.cash.order.temp;

import nl.ing.api.cash.order.StockJsonToCsvFor12Jun;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TempUtil {

    public static Map<String, Branch> populateBranchData(String branchInfoInputFile) throws IOException {
        List<String> lines =  Files.readAllLines(Paths.get(branchInfoInputFile));
        Map<String, Branch> idToBranch= new HashMap<>();
        for(String line : lines){
            String[] tokens = line.split(";");
            Branch b = new Branch(tokens[2], tokens[15],tokens[36],tokens[53],tokens[54],tokens[56]);
            idToBranch.put(tokens[1],b);
        }
        return idToBranch;
    }
}

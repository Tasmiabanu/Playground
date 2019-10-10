package com.carmel.bootcamp.tasmia;

import androidx.appcompat.app.AppCompatActivity;

public class JsonData extends AppCompatActivity {
  //  public static String url="https://wonder-stricken-str.000webhostapp.com/requisition/Requisition.txt";
  private JsonData jsonObject;

    String strParsedValue = null;

    private String strJSONValue = "[{\n" +
            "\t\t\"request-id\": \"30f14c6c1fc85cba12bfd093aa8f90e3\",\n" +
            "\t\t\"request-type\": \"SELF\",\n" +
            "\t\t\"requester-name\": \"Divya\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"request-id\": \"6a7f7b2f889b4ae8b849db1f635c971c\",\n" +
            "\t\t\"request-type\": \"TEAM/DEPARTMENT/BRANCH\",\n" +
            "\t\t\"requester-name\": \"Guarav\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"request-id\": \"84ae8b84c1fc85cf635c3af63f635c7\",\n" +
            "\t\t\"request-type\": \"SOMEONE ELSE\",\n" +
            "\t\t\"requester-name\": \"Samarth\"\n" +
            "\t}\n" +
            "]\n";


    public JsonData(String strJSONValue) {

    }
}

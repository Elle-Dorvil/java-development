package com.pluralsight;

public class NameFormatter {



private NameFormatter() {}

    public static String format(String firstName, String lastName) {
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
    StringBuilder newBuilder = new StringBuilder();

    newBuilder.append(lastName).append((", ");

    if (!prefix.isEmpty()) {
        newBuilder.append(prefix).append(" ");
    }

    newBuilder.append(firstName);

    if(!middleName.isEmpty()) {
            newBuilder.append(" ").append(middleName);
        }

        if (!suffix.isEmpty()) {
            newBuilder.append(", ").append(suffix);
        }

          return newBuilder.toString();
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(", ");
        String mainPart = parts[0];
        String suffix = parts.length > 1 ? parts[1] : "";



//        String suffix;
//        if (parts.length > 1) {
//            suffix = parts[1];
//        } else {
//            suffix = "";
//        }
        String[] nameParts = mainPart.split(" ");

        String prefix = "", firstName = "", middleName = "", lastName = "";

        switch (nameParts.length) {
            case 4:
                prefix = nameParts[0];
                firstName = nameParts[1];
                middleName = nameParts[2];
                lastName = nameParts[3];
                break;
            case 3:
                firstName = nameParts[0];
                middleName = nameParts[1];
                lastName = nameParts[2];
                break;
            case 2:
                firstName = nameParts[0];
                lastName = nameParts[1];
                break;
        }

        return format(prefix, firstName, middleName, lastName, suffix);

    }
}

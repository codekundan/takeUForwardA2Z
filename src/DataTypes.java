public class DataTypes {
    public static int dataTypes(String type) {
        int size = 0;
        switch(type) {
            case "Integer" :
                size = 4;
                break;
            case "Long" :
                size = 8;
                break;
            case "Float" :
                size = 4;
                break;
            case "Double" :
                size = 8;
                break;
            case "Character" :
                size = 1;
                break;
        }
        return size;
    }
}

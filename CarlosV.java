package tareas.Chocolates;

public class CarlosV {
    public String size, chocoType, hasSugar;
    public boolean sugar;

    public String getSize() {  return size;  }
    public String getChocoType() {  return chocoType;  }
    public boolean getSugar() {  return sugar;  }

    public boolean setSize(String size) {
        if(!size.isEmpty()){
            this.size = size;
            return true;
        }else
            return false;
    }

    public boolean setChocoType(String chocoType) {
        if(!size.isEmpty()){
            this.chocoType = chocoType;
            return true;
        }else
            return false;
    }

    public String setSugar(boolean sugar) {
        if(sugar)
            this.hasSugar = "With Sugar";
        else
            this.hasSugar = "Sugarfree";
        return hasSugar;
    }

    public String printState(){
        return "Chocolate: " + chocoType +
                "\nSize: " + size +
                "\nSugar: " + setSugar(sugar);
    }

    public static void main(String[] args) {}
}


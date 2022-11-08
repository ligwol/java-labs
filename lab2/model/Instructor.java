package model;
public class Instructor extends Person {

    /**
     * Идентификаторы курсов, которые может вести преподаватель
     */
    int[] canTeach;
    // TODO: добавить геттеры и сеттеры
    public void setCanTeach(int[] canTeach){
        this.canTeach=canTeach;
    }
    public int[] setCanTeach(){
       return canTeach;
    }
    
}
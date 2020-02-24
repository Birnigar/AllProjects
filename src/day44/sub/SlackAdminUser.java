package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {


     int adminId;


    public SlackAdminUser(String name,long phoneNumber,int adminId){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.adminId=adminId;
    }



    public void msgInChanel (){
        System.out.println(name + " just sent new message in #class_chat");
    }
    public void deleteMsg (){
        System.out.println(name + " deleted your message");
    }
    public void addChanel (){
        System.out.println(name + " added new #mentor_channel");
    }


    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {

        SlackAdminUser admin = new SlackAdminUser("Nigar",325648924,111);


        admin.msgInChanel();
        admin.addChanel();
        admin.deleteMsg();
        admin.callSomeone();
        admin.addEmoji();



    }








}

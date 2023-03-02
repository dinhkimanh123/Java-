public class Mobile {
    public int battery ;
    public String typing;
    public String[] inbox;
    public int count_inbox;
    public String[] list_msg_send;
    public int count_list_msg_sent;
    public boolean isOn;

    public Mobile(){
        inbox =new String[1000];
        list_msg_send = new String[1000];
        battery = 100;
        isOn = true;
        count_inbox = 0;
        count_list_msg_sent = 0;
    }
    public boolean isOn(){
        return this.isOn;
    }
    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff(){
        this.isOn = false;
    }
    public void charging(){
        this.battery = 100;
    }
    public void typing(String msg){
        if(this.isOn){
            this.typing = msg;
            battery--;
        }else {
            System.out.println("dien thoai het pin");
        }
    }
    public void send(Mobile receiver){
        if (this.isOn){
        if (count_list_msg_sent > 1000){
            System.out.println("bộ nhớ đầy");
        } else {
            if (!typing.equals("")){
                this.list_msg_send[count_list_msg_sent++] = this.typing;
                this.typing = "";
                battery--;
            }
          }
        }else {
            System.out.println("dien thoai het pin");
        }
    }
    public void receiver(String msg){
        if (this.isOn){
            this.inbox[count_inbox++] = msg;
            battery--;
        }else {
            System.out.println("dien thoai het pin");
        }
    }
    public void displaySend(){
        System.out.println("====Send====");
        for (int i = 0; i < this.count_list_msg_sent; i++) {
            System.out.println(list_msg_send[i]);
        }
    }
    public void displayInbox(){
        System.out.println("====Inbox====");
        for (int i = 0; i < this.count_inbox; i++) {
            System.out.println(inbox[i]);
        }
    }
    public void displayInfo(){
        System.out.println("% pin :"+this.battery +"%");
        System.out.println("bật :" + isOn);
        System.out.println("bộ nhớ tin nhắn dến"+ count_inbox + "/1000");
        System.out.println("bộ nhớ tin nhắn gửi "+ count_list_msg_sent +"/1000");
    }
}

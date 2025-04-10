class Train implements Comparable<Train>{
    private String name;
    private int ah,am;
    private int dh,dm;
    public void setName(String name){
        this.name=name;
    }
    public void setArrivalTime(int hh,int mm){
        this.ah=hh;
        this.am=mm;
    }
    public void setDepartureTime(int hh,int mm){
        this.dh=hh;
        this.dm=mm;
    }    
    public String getName(){
        return name;
    }
    public String getArrivalTime(){
        return String.format("%02d:%02d",ah,am);
    }
    public String getDepartureTime(){
        return String.format("%02d:%02d",dh,dm);
    }
    
    @Override
    public int compareTo(Train other){
        if(this.ah!=other.ah){
            return this.ah-other.ah;
        }
        else if(this.am!=other.am){
            return this.am-other.am;
        }
        else if(this.dh!=other.dh){
            return this.dh-other.dh;
        }
        else{
            return this.dm-other.dm;
        }
    }
}

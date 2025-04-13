class Theatre{
    private Set<Integer> bookedSeats;
    public Theatre(){
        bookedSeats=new HashSet<>();
    }
    public boolean book(int s,int e){
        for(int i=s;i<=e;i++){
            if(bookedSeats.contains(i)){
                return false;
            }
        }
        for(int i=s;i<=e;i++){
            bookedSeats.add(i);
        }
        return true;
    }
}

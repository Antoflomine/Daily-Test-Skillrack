class Shop{
    private Map<String,Integer> in=new HashMap<>();
    public void addItem(String item,int qty){
        if(in.containsKey(item)){
            in.put(item,in.get(item)+qty);
        }
        else{
            in.put(item,qty);
        }
    }
    public boolean orderItem(String item,int qty){
        if(in.containsKey(item) && in.get(item)>=qty){
          
                in.put(item,in.get(item)-qty);
                return true;
        }
        return false;
    }
}

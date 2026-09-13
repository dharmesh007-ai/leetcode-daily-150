class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0;
        int totalgas=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
        }
        for(int i=0;i<cost.length;i++){
            totalcost+=cost[i];
        }
        int start=0;
        int tank=0;
        if (totalgas<totalcost){
            return -1;
        }else{
            start=0;
            tank=0;
            for(int i=0;i<gas.length;i++){
                tank+=gas[i];
                tank-=cost[i];
                if(tank<0){
                    start=i+1;
                    tank=0;
                }
            }
            return start;
        }
    }
}
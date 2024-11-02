class Kokobanana{
    public static int minEatingSpeed(int[] piles,int h){
        int maxBanana=0;
        int n=piles.length;
        for(int i=0; i<n; i++){
            maxBanana=Math.max(maxBanana,piles[i]);
        }
        int l=0,r=maxBanana;
        int result=0;
        while(l <=r){
            int mid = (l+r)/2;
            if(funcTime(mid,piles,h) == true){
                result =mid;
                r=mid-1;

            }
            else{
                l= mid+1;
            }

        }
        return result;

    }
    public static boolean funcTime(int mid,int[] piles, int h){
        int timeTaken=0;
        for(int bananas: piles){
            timeTaken += Math.ceil((bananas*1.0)/mid);
        }

        if(timeTaken <= h)
            return true;
        else
            return false;
        

    }
    public static void main(String[] args) {
        int[] piles ={30,11,23,4,20};
        int h=5;
        int result = minEatingSpeed(piles, h);
        System.out.println("Speed is:"+ result);


    }
}
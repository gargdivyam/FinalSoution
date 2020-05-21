function Solution(D){
    String str[] = D.keys();
    int size = str.length;
    int arr[] = new int[size];
    int diff = 0;        
    int diff2 = 0;
    int valueDiff = 0;
    for(int i=0;i<size;i++)
    {
        arr[i] = Integer.parseInt(str[i]);
    }
    for(int i=0;i<size;i++){
        if(arr[i+1]-arr[i]==1)
        {
            continue;
        }
        if(arr[i+1]-arr[i]!=1)
        {
            diff = arr[i+1]-arr[0];
            diff2 = D.get(i+1).get(value)-D.get(i).get(value);
            int startValue = D.get(i).get(value);
            valueDiff = (diff2/diff);
            for(int j=0;j<diff-1;j++){
                D.put("arr[i]+1", startValue+(valueDiff*(j+1)));
            }
        }
    }
System.ou.print(D);
}
class demo{
    int a, b;
    demo(int i , int j){
        a = i;
        b = j;        
    }
    boolean equalTo(demo  o){
        return(o.a == a && o.b == b);
    }
}

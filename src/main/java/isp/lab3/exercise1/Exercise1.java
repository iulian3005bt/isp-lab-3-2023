package isp.lab3.exercise1;

class Tree {
    //atribute
    int height;

    //constructori
    public Tree(){
        this.height = 15;
    }

    public Tree (int height){
        this.height = height;
    }

    //metode
    public int grow(int meters){
        if(meters>=1)
        {this.height=this.height+meters;
        }
        return this.height;
    }

    public String toString(){
        return this.height+"";
    }

}
#include <iostream>
#include <cstring>
using namespace std;
int main(){
  int dice;
  cin>>dice;
  for(int i=0;i<dice;i++){
    int top=1, front=2, left=3, right=4, back=5, bottom=6, temp;
    string direct;
    cin>>direct;
    for(int j=0;j<direct.length();j++){
       if(direct[j] == 'F'){
         temp = front;
         front = top;
         top = back;
         back = bottom;
         bottom = temp;
       }
    }
    cout<<front<<"  ";
  }
}

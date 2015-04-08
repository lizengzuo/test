#include<stdio.h>
int main(void)
{
 char a[200];
 char ch;
 int i,x,y;
 int j;
printf("Enter a sentence:");
 for(i=0;i<200;i++)
 {
  scanf("%c",&a[i]);
  if(a[i]=='\n')
  {
   x=i;
   break;
  }
 }
 ch=a[x-1];
 printf("%c\n",ch);
 for(i=0;a[i]!=' ';i++)
  ;
 j=i;
 printf("%d\n",j);
 {
  if(x==j)
   goto L;
  for(i=x;a[i]!=' ';i--)
   ;
  y=i;
  for(i=y;i<x;i++)
   printf("%c",a[i]);
  x=y;
 }*/
L: for(i=0;i<j;i++)
  printf("%c",a[i]);
 printf("%c\n",ch);
 return 0;
}
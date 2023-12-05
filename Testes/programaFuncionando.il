.assembly extern mscorlib {}
.assembly _exemplo{}
.module _exemplo.exe

.class public _exemplo{
  .method static public void _principal(){
   .entrypoint
      
.locals init (int64 _ilado)
.locals init (int64 _iarea)
ldstr "digite um valor para lado: "
call void [mscorlib]System.Console::Write(string)
call string [mscorlib]System.Console::ReadLine()
call int64 [mscorlib]System.Int64::Parse(string)
stloc _ilado
ldloc _ilado
conv.r8
ldloc _ilado
conv.r8
mul
conv.i8
stloc _iarea
ldloc _iarea
conv.r8
conv.i8
call void [mscorlib]System.Console::WriteLine(int64)

   ret
 }
}
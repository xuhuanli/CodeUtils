#代码工具类

##ToastUtils

usage:ToastUtil.showShort(context,msg); 

context会在内部转成Application的context

##SharedPreference

thanks for [https://www.jianshu.com/p/fcd75a324c35](https://www.jianshu.com/p/fcd75a324c35)

usage : IPreference mSp = IPreference.prefHolder.getPreference(this);

存put 取get

##AppUtil

usage : 

AppUtil.getAppName(context)

AppUtil.getAppVersionName(context)

AppUtil.getAppVersionCode(context)

##DensityUtil

sp/dp px之间的转换工具 静态调用

##KeyboardUtil

displayIme(View view) //传入EditText

##MD5Util 

public static String encode(@NonNull String str, @Nullable String salt)

##Log

在Dev阶段推荐使用logger [https://github.com/orhanobut/logger](https://github.com/orhanobut/logger)

##ScreenUtil

获取屏幕的宽/高/状态栏高度/截屏
package com.soopeach.dowith.ui.icons.menu

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DoneMenu: ImageVector
    get() {
        if (_doneMenu != null) {
            return requireNotNull(_doneMenu)
        }
        _doneMenu = Builder(name = "DoneMenu", defaultWidth = 26.0.dp, defaultHeight = 26.0.dp,
                viewportWidth = 26.0f, viewportHeight = 26.0f).apply {
            path(fill = SolidColor(Color(0xFFB7B7B7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8125f, 8.125f)
                verticalLineTo(12.5399f)
                lineTo(17.4809f, 14.7408f)
                curveTo(17.6657f, 14.8518f, 17.7988f, 15.0316f, 17.851f, 15.2407f)
                curveTo(17.9032f, 15.4499f, 17.8702f, 15.6712f, 17.7592f, 15.8559f)
                curveTo(17.6482f, 16.0407f, 17.4684f, 16.1738f, 17.2593f, 16.226f)
                curveTo(17.0501f, 16.2782f, 16.8288f, 16.2452f, 16.6441f, 16.1342f)
                lineTo(12.5816f, 13.6967f)
                curveTo(12.4613f, 13.6245f, 12.3618f, 13.5223f, 12.2928f, 13.4003f)
                curveTo(12.2237f, 13.2782f, 12.1875f, 13.1403f, 12.1875f, 13.0f)
                verticalLineTo(8.125f)
                curveTo(12.1875f, 7.9095f, 12.2731f, 7.7028f, 12.4255f, 7.5505f)
                curveTo(12.5778f, 7.3981f, 12.7845f, 7.3125f, 13.0f, 7.3125f)
                curveTo(13.2155f, 7.3125f, 13.4222f, 7.3981f, 13.5745f, 7.5505f)
                curveTo(13.7269f, 7.7028f, 13.8125f, 7.9095f, 13.8125f, 8.125f)
                close()
                moveTo(13.0f, 3.25f)
                curveTo(11.7183f, 3.2468f, 10.4486f, 3.4978f, 9.2646f, 3.9886f)
                curveTo(8.0805f, 4.4793f, 7.0055f, 5.2f, 6.1019f, 6.109f)
                curveTo(5.3635f, 6.8565f, 4.7074f, 7.5756f, 4.0625f, 8.3281f)
                verticalLineTo(6.5f)
                curveTo(4.0625f, 6.2845f, 3.9769f, 6.0778f, 3.8245f, 5.9255f)
                curveTo(3.6721f, 5.7731f, 3.4655f, 5.6875f, 3.25f, 5.6875f)
                curveTo(3.0345f, 5.6875f, 2.8279f, 5.7731f, 2.6755f, 5.9255f)
                curveTo(2.5231f, 6.0778f, 2.4375f, 6.2845f, 2.4375f, 6.5f)
                verticalLineTo(10.5625f)
                curveTo(2.4375f, 10.778f, 2.5231f, 10.9847f, 2.6755f, 11.137f)
                curveTo(2.8279f, 11.2894f, 3.0345f, 11.375f, 3.25f, 11.375f)
                horizontalLineTo(7.3125f)
                curveTo(7.528f, 11.375f, 7.7347f, 11.2894f, 7.887f, 11.137f)
                curveTo(8.0394f, 10.9847f, 8.125f, 10.778f, 8.125f, 10.5625f)
                curveTo(8.125f, 10.347f, 8.0394f, 10.1403f, 7.887f, 9.988f)
                curveTo(7.7347f, 9.8356f, 7.528f, 9.75f, 7.3125f, 9.75f)
                horizontalLineTo(4.9766f)
                curveTo(5.7027f, 8.8948f, 6.4259f, 8.0894f, 7.2505f, 7.2546f)
                curveTo(8.3798f, 6.1254f, 9.8167f, 5.354f, 11.3819f, 5.0368f)
                curveTo(12.947f, 4.7196f, 14.5709f, 4.8706f, 16.0507f, 5.4711f)
                curveTo(17.5305f, 6.0715f, 18.8005f, 7.0947f, 19.7021f, 8.4128f)
                curveTo(20.6037f, 9.731f, 21.0968f, 11.2855f, 21.1199f, 12.8823f)
                curveTo(21.143f, 14.4791f, 20.6951f, 16.0473f, 19.832f, 17.391f)
                curveTo(18.9689f, 18.7346f, 17.729f, 19.7942f, 16.2672f, 20.4372f)
                curveTo(14.8054f, 21.0802f, 13.1866f, 21.2781f, 11.6129f, 21.0063f)
                curveTo(10.0392f, 20.7345f, 8.5806f, 20.005f, 7.4191f, 18.9089f)
                curveTo(7.3415f, 18.8355f, 7.2502f, 18.7782f, 7.1504f, 18.7401f)
                curveTo(7.0506f, 18.7021f, 6.9443f, 18.684f, 6.8376f, 18.687f)
                curveTo(6.7308f, 18.6901f, 6.6257f, 18.7141f, 6.5282f, 18.7577f)
                curveTo(6.4307f, 18.8014f, 6.3428f, 18.8638f, 6.2695f, 18.9414f)
                curveTo(6.1961f, 19.019f, 6.1388f, 19.1103f, 6.1007f, 19.2101f)
                curveTo(6.0626f, 19.3099f, 6.0446f, 19.4162f, 6.0476f, 19.523f)
                curveTo(6.0506f, 19.6297f, 6.0746f, 19.7349f, 6.1183f, 19.8323f)
                curveTo(6.1619f, 19.9298f, 6.2243f, 20.0177f, 6.3019f, 20.0911f)
                curveTo(7.4592f, 21.1832f, 8.8661f, 21.9754f, 10.4f, 22.3987f)
                curveTo(11.9339f, 22.822f, 13.548f, 22.8634f, 15.1015f, 22.5194f)
                curveTo(16.6551f, 22.1754f, 18.1008f, 21.4564f, 19.3126f, 20.4252f)
                curveTo(20.5244f, 19.3939f, 21.4654f, 18.0818f, 22.0534f, 16.6032f)
                curveTo(22.6414f, 15.1247f, 22.8587f, 13.5247f, 22.6862f, 11.9429f)
                curveTo(22.5137f, 10.3611f, 21.9566f, 8.8456f, 21.0637f, 7.5286f)
                curveTo(20.1708f, 6.2115f, 18.9691f, 5.1331f, 17.5635f, 4.3873f)
                curveTo(16.1579f, 3.6415f, 14.5912f, 3.251f, 13.0f, 3.25f)
                close()
            }
        }
        .build()
        return requireNotNull(_doneMenu)
    }

private var _doneMenu: ImageVector? = null

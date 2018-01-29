package com.lmy.ffmpeg.codec;

/**
 * Created by lmy on 2017/4/20.
 */

public class AVPixelFormat {
    public final static int AV_PIX_FMT_NONE = -1;
    public final static int AV_PIX_FMT_YUV420P = 0;
    public final static int AV_PIX_FMT_YUYV422 = 1;
    public final static int AV_PIX_FMT_RGB24 = 2;
    public final static int AV_PIX_FMT_BGR24 = 3;
    public final static int AV_PIX_FMT_YUV422P = 4;
    public final static int AV_PIX_FMT_YUV444P = 5;
    public final static int AV_PIX_FMT_YUV410P = 6;
    public final static int AV_PIX_FMT_YUV411P = 7;
    public final static int AV_PIX_FMT_GRAY8 = 8;
    public final static int AV_PIX_FMT_MONOWHITE = 9;
    public final static int AV_PIX_FMT_MONOBLACK = 10;
    public final static int AV_PIX_FMT_PAL8 = 11;
    public final static int AV_PIX_FMT_YUVJ420P = 12;
    public final static int AV_PIX_FMT_YUVJ422P = 13;
    public final static int AV_PIX_FMT_YUVJ444P = 14;
    public final static int AV_PIX_FMT_XVMC_MPEG2_MC = 15;
    public final static int AV_PIX_FMT_XVMC_MPEG2_IDCT = 16;
    public final static int AV_PIX_FMT_XVMC = 17;//same AV_PIX_FMT_XVMC_MPEG2_IDCT
    public final static int AV_PIX_FMT_UYVY422 = 18;
    public final static int AV_PIX_FMT_UYYVYY411 = 19;
    public final static int AV_PIX_FMT_BGR8 = 20;
    public final static int AV_PIX_FMT_BGR4 = 0;
    public final static int AV_PIX_FMT_BGR4_BYTE = 0;
    public final static int AV_PIX_FMT_RGB8 = 0;
    public final static int AV_PIX_FMT_RGB4 = 0;
    public final static int AV_PIX_FMT_RGB4_BYTE = 0;
    public final static int AV_PIX_FMT_NV12 = 0;
    public final static int AV_PIX_FMT_NV21 = 0;
    public final static int AV_PIX_FMT_ARGB = 0;
    public final static int AV_PIX_FMT_RGBA = 0;
    public final static int AV_PIX_FMT_ABGR = 0;
    public final static int AV_PIX_FMT_BGRA = 0;
    public final static int AV_PIX_FMT_GRAY16BE = 0;
    public final static int AV_PIX_FMT_GRAY16LE = 0;
    public final static int AV_PIX_FMT_YUV440P = 0;
    public final static int AV_PIX_FMT_YUVJ440P = 0;
    public final static int AV_PIX_FMT_YUVA420P = 0;
    public final static int AV_PIX_FMT_VDPAU_H264 = 0;
    public final static int AV_PIX_FMT_VDPAU_MPEG1 = 0;
    public final static int AV_PIX_FMT_VDPAU_MPEG2 = 0;
    public final static int AV_PIX_FMT_VDPAU_WMV3 = 0;
    public final static int AV_PIX_FMT_VDPAU_VC1 = 0;
    public final static int AV_PIX_FMT_RGB48BE = 0;
    public final static int AV_PIX_FMT_RGB48LE = 0;
    public final static int AV_PIX_FMT_RGB565BE = 0;
    public final static int AV_PIX_FMT_RGB565LE = 0;
    public final static int AV_PIX_FMT_RGB555BE = 0;
    public final static int AV_PIX_FMT_RGB555LE = 0;
    public final static int AV_PIX_FMT_BGR565BE = 0;
    public final static int AV_PIX_FMT_BGR565LE = 0;
    public final static int AV_PIX_FMT_BGR555BE = 0;
    public final static int AV_PIX_FMT_BGR555LE = 0;
    public final static int AV_PIX_FMT_VAAPI_MOCO = 0;
    public final static int AV_PIX_FMT_VAAPI_IDCT = 0;
    public final static int AV_PIX_FMT_VAAPI_VLD = 0;
    public final static int AV_PIX_FMT_VAAPI = 0;//same AV_PIX_FMT_VAAPI_VLD
    public final static int AV_PIX_FMT_YUV420P16LE = 0;
    public final static int AV_PIX_FMT_YUV420P16BE = 0;
    public final static int AV_PIX_FMT_YUV422P16LE = 0;
    public final static int AV_PIX_FMT_YUV422P16BE = 0;
    public final static int AV_PIX_FMT_YUV444P16LE = 0;
    public final static int AV_PIX_FMT_YUV444P16BE = 0;
    public final static int AV_PIX_FMT_VDPAU_MPEG4 = 0;
    public final static int AV_PIX_FMT_DXVA2_VLD = 0;
    public final static int AV_PIX_FMT_RGB444LE = 0;
    public final static int AV_PIX_FMT_RGB444BE = 0;
    public final static int AV_PIX_FMT_BGR444LE = 0;
    public final static int AV_PIX_FMT_BGR444BE = 0;
    public final static int AV_PIX_FMT_YA8 = 0;
    public final static int AV_PIX_FMT_Y400A = 0;//same AV_PIX_FMT_YA8
    public final static int AV_PIX_FMT_GRAY8A = 0;//same AV_PIX_FMT_YA8
    public final static int AV_PIX_FMT_BGR48BE = 0;
    public final static int AV_PIX_FMT_BGR48LE = 0;
    public final static int AV_PIX_FMT_YUV420P9BE = 0;
    public final static int AV_PIX_FMT_YUV420P9LE = 0;
    public final static int AV_PIX_FMT_YUV420P10BE = 0;
    public final static int AV_PIX_FMT_YUV420P10LE = 0;
    public final static int AV_PIX_FMT_YUV422P10BE = 0;
    public final static int AV_PIX_FMT_YUV422P10LE = 0;
    public final static int AV_PIX_FMT_YUV444P9BE = 0;
    public final static int AV_PIX_FMT_YUV444P9LE = 0;
    public final static int AV_PIX_FMT_YUV444P10BE = 0;
    public final static int AV_PIX_FMT_YUV444P10LE = 0;
    public final static int AV_PIX_FMT_YUV422P9BE = 0;
    public final static int AV_PIX_FMT_YUV422P9LE = 0;
    public final static int AV_PIX_FMT_VDA_VLD = 0;
    public final static int AV_PIX_FMT_GBRP = 0;
    public final static int AV_PIX_FMT_GBR24P = 0;//same AV_PIX_FMT_GBRP
    public final static int AV_PIX_FMT_GBRP9BE = 0;
    public final static int AV_PIX_FMT_GBRP9LE = 0;
    public final static int AV_PIX_FMT_GBRP10BE = 0;
    public final static int AV_PIX_FMT_GBRP10LE = 0;
    public final static int AV_PIX_FMT_GBRP16BE = 0;
    public final static int AV_PIX_FMT_GBRP16LE = 0;
    public final static int AV_PIX_FMT_YUVA422P = 0;
    public final static int AV_PIX_FMT_YUVA444P = 0;
    public final static int AV_PIX_FMT_YUVA420P9BE = 0;
    public final static int AV_PIX_FMT_YUVA420P9LE = 0;
    public final static int AV_PIX_FMT_YUVA422P9BE = 0;
    public final static int AV_PIX_FMT_YUVA422P9LE = 0;
    public final static int AV_PIX_FMT_YUVA444P9BE = 0;
    public final static int AV_PIX_FMT_YUVA444P9LE = 0;
    public final static int AV_PIX_FMT_YUVA420P10BE = 0;
    public final static int AV_PIX_FMT_YUVA420P10LE = 0;
    public final static int AV_PIX_FMT_YUVA422P10BE = 0;
    public final static int AV_PIX_FMT_YUVA422P10LE = 0;
    public final static int AV_PIX_FMT_YUVA444P10BE = 0;
    public final static int AV_PIX_FMT_YUVA444P10LE = 0;
    public final static int AV_PIX_FMT_YUVA420P16BE = 0;
    public final static int AV_PIX_FMT_YUVA420P16LE = 0;
    public final static int AV_PIX_FMT_YUVA422P16BE = 0;
    public final static int AV_PIX_FMT_YUVA422P16LE = 0;
    public final static int AV_PIX_FMT_YUVA444P16BE = 0;
    public final static int AV_PIX_FMT_YUVA444P16LE = 0;
    public final static int AV_PIX_FMT_VDPAU = 0;
    public final static int AV_PIX_FMT_XYZ12LE = 0;
    public final static int AV_PIX_FMT_XYZ12BE = 0;
    public final static int AV_PIX_FMT_NV16 = 0;
    public final static int AV_PIX_FMT_NV20LE = 0;
    public final static int AV_PIX_FMT_NV20BE = 0;
    public final static int AV_PIX_FMT_RGBA64BE = 0;
    public final static int AV_PIX_FMT_RGBA64LE = 0;
    public final static int AV_PIX_FMT_BGRA64BE = 0;
    public final static int AV_PIX_FMT_BGRA64LE = 0;
    public final static int AV_PIX_FMT_YVYU422 = 0;
    public final static int AV_PIX_FMT_VDA = 0;
    public final static int AV_PIX_FMT_YA16BE = 0;
    public final static int AV_PIX_FMT_YA16LE = 0;
    public final static int AV_PIX_FMT_GBRAP = 0;
    public final static int AV_PIX_FMT_GBRAP16BE = 0;
    public final static int AV_PIX_FMT_GBRAP16LE = 0;
    public final static int AV_PIX_FMT_QSV = 0;
    public final static int AV_PIX_FMT_MMAL = 0;
    public final static int AV_PIX_FMT_D3D11VA_VLD = 0;
    public final static int AV_PIX_FMT_CUDA = 0;
    public final static int AV_PIX_FMT_0RGB = 0;//=0x123+4
    public final static int AV_PIX_FMT_RGB0 = 0;
    public final static int AV_PIX_FMT_0BGR = 0;
    public final static int AV_PIX_FMT_BGR0 = 0;
    public final static int AV_PIX_FMT_YUV420P12BE = 0;
    public final static int AV_PIX_FMT_YUV420P12LE = 0;
    public final static int AV_PIX_FMT_YUV420P14BE = 0;
    public final static int AV_PIX_FMT_YUV420P14LE = 0;
    public final static int AV_PIX_FMT_YUV422P12BE = 0;
    public final static int AV_PIX_FMT_YUV422P12LE = 0;
    public final static int AV_PIX_FMT_YUV422P14BE = 0;
    public final static int AV_PIX_FMT_YUV422P14LE = 0;
    public final static int AV_PIX_FMT_YUV444P12BE = 0;
    public final static int AV_PIX_FMT_YUV444P12LE = 0;
    public final static int AV_PIX_FMT_YUV444P14BE = 0;
    public final static int AV_PIX_FMT_YUV444P14LE = 0;
    public final static int AV_PIX_FMT_GBRP12BE = 0;
    public final static int AV_PIX_FMT_GBRP12LE = 0;
    public final static int AV_PIX_FMT_GBRP14BE = 0;
    public final static int AV_PIX_FMT_GBRP14LE = 0;
    public final static int AV_PIX_FMT_YUVJ411P = 0;
    public final static int AV_PIX_FMT_BAYER_BGGR8 = 0;
    public final static int AV_PIX_FMT_BAYER_RGGB8 = 0;
    public final static int AV_PIX_FMT_BAYER_GBRG8 = 0;
    public final static int AV_PIX_FMT_BAYER_GRBG8 = 0;
    public final static int AV_PIX_FMT_BAYER_BGGR16LE = 0;
    public final static int AV_PIX_FMT_BAYER_BGGR16BE = 0;
    public final static int AV_PIX_FMT_BAYER_RGGB16LE = 0;
    public final static int AV_PIX_FMT_BAYER_RGGB16BE = 0;
    public final static int AV_PIX_FMT_BAYER_GBRG16LE = 0;
    public final static int AV_PIX_FMT_BAYER_GBRG16BE = 0;
    public final static int AV_PIX_FMT_BAYER_GRBG16LE = 0;
    public final static int AV_PIX_FMT_BAYER_GRBG16BE = 0;
    public final static int AV_PIX_FMT_YUV440P10LE = 0;
    public final static int AV_PIX_FMT_YUV440P10BE = 0;
    public final static int AV_PIX_FMT_YUV440P12LE = 0;
    public final static int AV_PIX_FMT_YUV440P12BE = 0;
    public final static int AV_PIX_FMT_AYUV64LE = 0;
    public final static int AV_PIX_FMT_AYUV64BE = 0;
    public final static int AV_PIX_FMT_VIDEOTOOLBOX = 0;
    public final static int AV_PIX_FMT_P010LE = 0;
    public final static int AV_PIX_FMT_P010BE = 0;
    public final static int AV_PIX_FMT_GBRAP12BE = 0;
    public final static int AV_PIX_FMT_GBRAP12LE = 0;
    public final static int AV_PIX_FMT_GBRAP10BE = 0;
    public final static int AV_PIX_FMT_GBRAP10LE = 0;
    public final static int AV_PIX_FMT_MEDIACODEC = 0;
    public final static int AV_PIX_FMT_GRAY12BE = 0;
    public final static int AV_PIX_FMT_GRAY12LE = 0;
    public final static int AV_PIX_FMT_GRAY10BE = 0;
    public final static int AV_PIX_FMT_GRAY10LE = 0;
    public final static int AV_PIX_FMT_P016LE = 0;
    public final static int AV_PIX_FMT_P016BE = 0;
    public final static int AV_PIX_FMT_NB = 0;
}
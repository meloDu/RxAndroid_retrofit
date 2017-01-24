package com.rmtd.melo.rxandroidretrofit;

import java.util.List;

/**
 * Created by melo on 2017/1/24.
 */
public class ExamlpeBean {

    /**
     * rs_code : 1000
     * data : {"count":4,"items":[{"id":276,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/903/03/3/103b1614bc68e78b3a0463cb10eb3903.jpg","img_w":308,"img_h":160},"action":{"type":4,"info":"524"}},{"id":275,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/563/63/3/b519b53b3c830e8994aa34ced8fd6563.jpg","img_w":308,"img_h":160},"action":{"type":4,"info":"523"}},{"id":282,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/a5d/5d/d/9c388f51f064f11478d4e13234f67a5d.jpg","img_w":300,"img_h":152},"action":{"type":4,"info":"533"}},{"id":226,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/4d3/d3/3/7d8b74bf4033ed2c74e3fb6ea028e4d3.jpg","img_w":300,"img_h":150},"action":{"type":2,"info":"5"}}]}
     * rs_msg : success
     */

    private String rs_code;
    private DataBean data;
    private String rs_msg;

    public String getRs_code() {
        return rs_code;
    }

    public void setRs_code(String rs_code) {
        this.rs_code = rs_code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getRs_msg() {
        return rs_msg;
    }

    public void setRs_msg(String rs_msg) {
        this.rs_msg = rs_msg;
    }

    public static class DataBean {
        /**
         * count : 4
         * items : [{"id":276,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/903/03/3/103b1614bc68e78b3a0463cb10eb3903.jpg","img_w":308,"img_h":160},"action":{"type":4,"info":"524"}},{"id":275,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/563/63/3/b519b53b3c830e8994aa34ced8fd6563.jpg","img_w":308,"img_h":160},"action":{"type":4,"info":"523"}},{"id":282,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/a5d/5d/d/9c388f51f064f11478d4e13234f67a5d.jpg","img_w":300,"img_h":152},"action":{"type":4,"info":"533"}},{"id":226,"title":"","desc":"","img":{"img_url":"http://img.lingshi.cccwei.com/lingshi/4d3/d3/3/7d8b74bf4033ed2c74e3fb6ea028e4d3.jpg","img_w":300,"img_h":150},"action":{"type":2,"info":"5"}}]
         */

        private int count;
        private List<ItemsBean> items;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * id : 276
             * title :
             * desc :
             * img : {"img_url":"http://img.lingshi.cccwei.com/lingshi/903/03/3/103b1614bc68e78b3a0463cb10eb3903.jpg","img_w":308,"img_h":160}
             * action : {"type":4,"info":"524"}
             */

            private int id;
            private String title;
            private String desc;
            private ImgBean img;
            private ActionBean action;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public ImgBean getImg() {
                return img;
            }

            public void setImg(ImgBean img) {
                this.img = img;
            }

            public ActionBean getAction() {
                return action;
            }

            public void setAction(ActionBean action) {
                this.action = action;
            }

            public static class ImgBean {
                /**
                 * img_url : http://img.lingshi.cccwei.com/lingshi/903/03/3/103b1614bc68e78b3a0463cb10eb3903.jpg
                 * img_w : 308
                 * img_h : 160
                 */

                private String img_url;
                private int img_w;
                private int img_h;

                public String getImg_url() {
                    return img_url;
                }

                public void setImg_url(String img_url) {
                    this.img_url = img_url;
                }

                public int getImg_w() {
                    return img_w;
                }

                public void setImg_w(int img_w) {
                    this.img_w = img_w;
                }

                public int getImg_h() {
                    return img_h;
                }

                public void setImg_h(int img_h) {
                    this.img_h = img_h;
                }
            }

            public static class ActionBean {
                /**
                 * type : 4
                 * info : 524
                 */

                private int type;
                private String info;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }
            }
        }
    }
}

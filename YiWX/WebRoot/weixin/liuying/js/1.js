(function(a){
    varb={
        numOfCol: 5,
        offsetX: 5,
        offsetY: 5,
        blockElement: "div"
    };varc,
    d;vare=[
        
    ];if(!Array.prototype.indexOf){
        Array.prototype.indexOf=function(a){
            varb=this.length>>>0;varc=Number(arguments[
                1
            ])||0;c=c<0?Math.ceil(c): Math.floor(c);if(c<0)c+=b;for(;c<b;c++){
                if(cinthis&&this[
                    c
                ]===a)returnc
            }return-1
        }
    }varf=function(){
        e=[
            
        ];for(vara=0;a<b.numOfCol;a++){
            g("empty-"+a,
            a,
            0,
            1,
            -b.offsetY)
        }
    };varg=function(a,
    c,
    d,
    f,
    g){
        for(varh=0;h<f;h++){
            vari=newObject;i.x=c+h;i.size=f;i.endY=d+g+b.offsetY*2;e.push(i)
        }
    };varh=function(a,
    b){
        for(varc=0;c<b;c++){
            vard=i(a+c,
            "x");e.splice(d,
            1)
        }
    };vari=function(a,
    b){
        for(varc=0;c<e.length;c++){
            vard=e[
                c
            ];if(b=="x"&&d.x==a){
                returnc
            }elseif(b=="endY"&&d.endY==a){
                returnc
            }
        }
    };varj=function(a,
    b){
        varc=[
            
        ];for(vard=0;d<b;d++){
            c.push(e[
                i(a+d,
                "x")
            ].endY)
        }varf=Math.min.apply(Math,
        c);varg=Math.max.apply(Math,
        c);return[
            f,
            g,
            c.indexOf(f)
        ]
    };vark=function(a){
        if(a>1){
            varb=e.length-a;varc=false;vard,
            f;for(varg=0;g<e.length;g++){
                varh=e[
                    g
                ];vari=h.x;if(i>=0&&i<=b){
                    vark=j(i,
                    a);if(!c){
                        c=true;d=k;f=i
                    }else{
                        if(k[
                            1
                        ]<d[
                            1
                        ]){
                            d=k;f=i
                        }
                    }
                }
            }return[
                f,
                d[
                    1
                ]
            ]
        }else{
            d=j(0,
            e.length);return[
                d[
                    2
                ],
                d[
                    0
                ]
            ]
        }
    };varl=function(a,
    c){
        if(!a.data("size")||a.data("size")<0){
            a.data("size",
            1)
        }elseif(a.data("size")>b.numOfCol){
            a.data("size",
            b.numOfCol)
        }vare=k(a.data("size"));varf=d*a.data("size")-(a.outerWidth()-a.width());a.css({
            width: f-b.offsetX*2,
            left: e[
                0
            ]*d,
            top: e[
                1
            ],
            position: "absolute"
        });vari=a.outerHeight();h(e[
            0
        ],
        a.data("size"));g(a.attr("id"),
        e[
            0
        ],
        e[
            1
        ],
        a.data("size"),
        i)
    };a.fn.BlocksIt=function(g){
        if(g&&typeofg==="object"){
            a.extend(b,
            g)
        }c=a(this);d=c.width()/b.numOfCol;f();c.children(b.blockElement).each(function(b){
            l(a(this),
            b)
        });varh=j(0,
        e.length);c.height(h[
            1
        ]+b.offsetY);returnthis
    }
})(jQuery)
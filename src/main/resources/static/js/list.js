new Vue({
	el:'#article',
	data:{
		categoryList:[],
		searchText:"",
		articleList:[]
	},
	methods:{
		searchClick:function(){
			var $this = this;
			$post("/category/searchCategory",{"text":this.searchText},function(data){
				if(data.length==0) return;
				$this.categoryList = data;
			});
		}
	},
	mounted:function(){
		//初始化目录信息
		this.searchClick();
	}
	
});
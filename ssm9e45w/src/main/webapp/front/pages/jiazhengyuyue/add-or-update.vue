<template>
	<view class="content">
		<form class="app-update-pv">
			
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">订单编号</view>
				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="right-input">
					{{ruleForm.dingdanbianhao}}
				</view>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">服务名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.fuwumingcheng" v-model="ruleForm.fuwumingcheng" placeholder="服务名称"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">账号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zhanghao" v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">家政姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiazhengxingming" v-model="ruleForm.jiazhengxingming" placeholder="家政姓名"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiage" v-model="ruleForm.jiage" placeholder="价格"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">预约时长</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yuyueshizhang" v-model="ruleForm.yuyueshizhang" placeholder="预约时长"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">总价格</view>
				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="right-input">
					{{zongjiage}}
				</view>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">预约时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.yuyueshijian" placeholder="预约时间" @tap="toggleTab('yuyueshijian')"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">用户名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yonghuming" v-model="ruleForm.yonghuming" placeholder="用户名"></input>
			</view>
			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">预约内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.yuyueneirong" placeholder="预约内容"></textarea>
			</view>
			
			
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(51, 153, 153, 1)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="yuyueshijianConfirm" ref="yuyueshijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
				dingdanbianhao: this.getUUID(),
				fuwumingcheng: '',
				zhanghao: '',
				jiazhengxingming: '',
				jiage: '',
				yuyueshizhang: '',
				zongjiage: '',
				yuyueneirong: '',
				yuyueshijian: '',
				yonghuming: '',
				xingming: '',
				sfsh: '',
				shhf: '',
				ispay: '',
				userid: '',
				},
				// 登陆用户信息
				user: {},
                                ro:{
                                   dingdanbianhao : false,
                                   fuwumingcheng : false,
                                   zhanghao : false,
                                   jiazhengxingming : false,
                                   jiage : false,
                                   yuyueshizhang : false,
                                   zongjiage : false,
                                   yuyueneirong : false,
                                   yuyueshijian : false,
                                   yonghuming : false,
                                   xingming : false,
                                   sfsh : false,
                                   shhf : false,
                                   ispay : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			
			
			
			
			
			
			zongjiage:{
			get: function () {
				return 1*this.ruleForm.jiage*this.ruleForm.yuyueshizhang
			}
			},
			
			
			
			
			
			
			
			
			
		},
		async onLoad(options) {
        		this.ruleForm.yuyueshijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuming = this.user.yonghuming
			this.ruleForm.xingming = this.user.xingming


			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`jiazhengyuyue`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='dingdanbianhao'){
					this.ruleForm.dingdanbianhao = obj[o];
					this.ro.dingdanbianhao = true;
					continue;
					}
					if(o=='fuwumingcheng'){
					this.ruleForm.fuwumingcheng = obj[o];
					this.ro.fuwumingcheng = true;
					continue;
					}
					if(o=='zhanghao'){
					this.ruleForm.zhanghao = obj[o];
					this.ro.zhanghao = true;
					continue;
					}
					if(o=='jiazhengxingming'){
					this.ruleForm.jiazhengxingming = obj[o];
					this.ro.jiazhengxingming = true;
					continue;
					}
					if(o=='jiage'){
					this.ruleForm.jiage = obj[o];
					this.ro.jiage = true;
					continue;
					}
					if(o=='yuyueshizhang'){
					this.ruleForm.yuyueshizhang = obj[o];
					this.ro.yuyueshizhang = true;
					continue;
					}
					if(o=='zongjiage'){
					this.ruleForm.zongjiage = obj[o];
					this.ro.zongjiage = true;
					continue;
					}
					if(o=='yuyueneirong'){
					this.ruleForm.yuyueneirong = obj[o];
					this.ro.yuyueneirong = true;
					continue;
					}
					if(o=='yuyueshijian'){
					this.ruleForm.yuyueshijian = obj[o];
					this.ro.yuyueshijian = true;
					continue;
					}
					if(o=='yonghuming'){
					this.ruleForm.yonghuming = obj[o];
					this.ro.yonghuming = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			yuyueshijianConfirm(val) {
				console.log(val)
				this.ruleForm.yuyueshijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
				this.ruleForm.zongjiage = this.zongjiage
				if((!this.ruleForm.fuwumingcheng)){
					this.$utils.msg(`服务名称不能为空`);
					return
				}
				if((!this.ruleForm.jiage)){
					this.$utils.msg(`价格不能为空`);
					return
				}
				if(this.ruleForm.jiage&&(!this.$validate.isIntNumer(this.ruleForm.jiage))){
					this.$utils.msg(`价格应输入整数`);
					return
				}
				if((!this.ruleForm.yuyueshizhang)){
					this.$utils.msg(`预约时长不能为空`);
					return
				}
				if(this.ruleForm.yuyueshizhang&&(!this.$validate.isIntNumer(this.ruleForm.yuyueshizhang))){
					this.$utils.msg(`预约时长应输入整数`);
					return
				}
				if((!this.ruleForm.zongjiage)){
					this.$utils.msg(`总价格不能为空`);
					return
				}
				if(this.ruleForm.zongjiage&&(!this.$validate.isIntNumer(this.ruleForm.zongjiage))){
					this.$utils.msg(`总价格应输入整数`);
					return
				}
				if(this.ruleForm.id){
					await this.$api.update(`jiazhengyuyue`, this.ruleForm);
				}else{
					await this.$api.add(`jiazhengyuyue`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>

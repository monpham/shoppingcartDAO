// ngon ngu lap trinh ajax gui cac request

$(document).ready(function(){
	var masanpham = 0;
	
	$("#cot1").click(function(){
		var chuoi = $("#cot1").attr("data-text");
		alert(chuoi);
	});
	
	$("#btnDangNhap").click(function(){
		var ten = $("#email").val();
		var password = $("#matkhau").val();
		
		$.ajax({
			url:"/minishop/api/KiemTraDangNhap",
		    type:"GET",
		    data:{
		    	email:ten,
		    	matkhau:password
		    },
			success: function(value){
				if(value == "true"){
					duongDanHienTai = window.location.href;
					duongDan = duongDanHienTai.replace("dangnhap/","");
					window.location = duongDan;
					
				}else{
					$("#ketqua").text("dang nhap that bai !")
				}
				
			}
		})
		
		
	});


	// ajax dang ky dang nhap
	$("#dangnhap").click(function(){
		$(this).addClass("actived");
		$("#dangky").removeClass("actived");
		$(".container-login-form").show();
		$(".container-signup-form").css("display","none");
	});
	
	$("#dangky").click(function(){
		$(this).addClass("actived");
		$("#dangnhap").removeClass("actived");
		$(".container-login-form").hide();
		$(".container-signup-form").show();
	});


	// xu ly su kien cick gio hang
	// closest dung de goi the tr find gi den class can tim

	$(".btn-giohang").click(function(){
		var machitiet = $(this).attr("data-machitiet");
		var mamau = $(this).closest("tr").find(".mau").attr("data-mamau");
		var tenmau = $(this).closest("tr").find(".mau").text();
		var masize = $(this).closest("tr").find(".size").attr("data-masize");
		var tensize = $(this).closest("tr").find(".size").text();
		var soluong = $(this).closest("tr").find(".soluong").text();
		var tensp = $("#tensp").text();
		var masp = $("#tensp").attr("data-masp");
		var giatien = $("#giatien").attr("data-value");


		$.ajax({
			url:"/ThemGioHang",
		    type:"GET",
		    data:{
				//truyen qua cac tham so sao cho cac tham so truyen vao trung voi ten tham so co trong class gio hang
				// neu dung se goi sang page co duong dan la them gio hang
		    	masp:masp,
		    	masize:masize,
		    	mamau:mamau,
		    	tensp: tensp,
		    	giatien:giatien,
		    	tenmau:tenmau,
		    	tensize:tensize,
		    	soluong:soluong,
		    	machitiet:machitiet
		    },
			// mot ham duoc goi khi request thanh cong
			success: function(value){
				$("#giohang").find("div").addClass("circle-giohang");
				$("#giohang").find("div").html("<span>" + value + "</span>") ;
			}
		})
//		}).done(function(){
//			$.ajax({
//				url:"/minishop/api/LaySoLuongGioHang",
//			    type:"GET",
//				success: function(value){
//					$("#giohang").find("div").addClass("circle-giohang");
//					$("#giohang").find("div").html("<span>" + value + "</span>") ;
//				}
//			})
//		});
	});
// ham tong tien
	GanTongTienGioHang();
	function GanTongTienGioHang(isEventChange){
		var tongtiensp = 0;
		$(".giatien").each(function () {
			var giatien = $(this).text();
			//var soluong = $(this).closest("tr").find(".soluong-giohang").val();

			var format = parseFloat(giatien).toFixed(3).replace(/(\d)(?=(\d{3})+\.)/g, "$1.").toString()
			tongtiensp = tongtiensp + parseFloat(format);
// kiem tra su kien thay doi o class so luong gio hang . neu khong thay doi thi hien thi gia tien ban dau
			if (!isEventChange){
				$(this).html(format);
			}

			var formatTongtien = tongtiensp.toFixed(3).replace(/(\d)(?=(\d{3})+\.)/g, "$1.").toString()
			$("#tongtien").html(formatTongtien+"");
		})
	}
	$(".xoa-giohang").click(function () {
		var self = $(this);
		var mamau = $(this).closest("tr").find(".mau").attr("data-mamau");
		var masize = $(this).closest("tr").find(".size").attr("data-masize");
		var masp = $(this).closest("tr").find(".tensp").attr("data-masp");
		$.ajax({
					url:"/XoaGioHang",
				    type:"GET",
				    data:{
				    	masp:masp,
				    	masize:masize,
				    	mamau:mamau

				    },
					success: function(value){
						self.closest("tr").remove();
						GanTongTienGioHang(true);
					}
				})
	})


	// $(".xoa-giohang").click(function(){
	// 	alert(ddfdgfdg);
	// 	var self = $(this);
	// 	var mamau = $(this).closest("tr").find(".mau").attr("data-mamau");
	// 	var masize = $(this).closest("tr").find(".size").attr("data-masize");
	// 	var masp = $(this).closest("tr").find(".tensp").attr("data-masp");
	//
	// 	$.ajax({
	// 		url:"/XoaGioHang",
	// 	    type:"GET",
	// 	    data:{
	// 	    	masp:masp,
	// 	    	masize:masize,
	// 	    	mamau:mamau
	//
	// 	    },
	// 		success: function(value){
	// 			self.closest("tr").remove();
	// 			GanTongTienGioHang(true);
	// 		}
	// 	})
	// })


	// change su kien thay doi value trong text .
	$(".soluong-giohang").change(function(){

		var soluong = $(this).val();
		var giatien = $(this).closest("tr").find(".giatien").attr("data-value");
// dinh dang kieu tien te tofixed
		// relace: chu so dau bat buoc phai co phai kiem tra xem o phia sau cos 3 chu so va ngan cach boi dau.
		// va dinh dang theo kieu tien te
		var tongtien = soluong * parseFloat(giatien);
		var format = tongtien.toFixed(3).replace(/(\d)(?=(\d{3})+\.)/g, "$1.").toString()
		$(this).closest("tr").find(".giatien").html(format);
		GanTongTienGioHang(true);

		var mamau = $(this).closest("tr").find(".mau").attr("data-mamau");
		var masize = $(this).closest("tr").find(".size").attr("data-masize");
		var masp = $(this).closest("tr").find(".tensp").attr("data-masp");

		$.ajax({
			url:"/CapNhatGioHang",
			type:"GET",
			data:{
				masp:masp,
				masize:masize,
				mamau:mamau,
				soluong:soluong

			},
			success: function(value){

			}
		})
	})
	
	$("body").on("click",".paging-item",function(){
		$(".paging-item").removeClass("active");
		$(this).addClass("active");
		var sotrang = $(this).text();
		var spbatdau = (sotrang - 1) * 5;
		
		$.ajax({
			url:"/minishop/api/LaySanPhamLimit",
		    type:"GET",
		    data:{
		    	spbatdau:spbatdau,
		    	
		    },
			success: function(value){
				var tbodysanpham = $("#table-sanpham").find("tbody");
				tbodysanpham.empty();
				tbodysanpham.append(value);
			}
		})
	})
	
	$("#checkall").change(function(){
		if(this.checked){
			$("#table-sanpham input").each(function(){
				$(this).attr("checked",true);
			})
		}else{
			$("#table-sanpham input").each(function(){
				$(this).attr("checked",false);
			})
		}
	})
	
	$("#xoa-sanpham").click(function(){
		$("#table-sanpham > tbody input:checked").each(function(){
			var masanpham = $(this).val();
			var This = $(this);
			This.closest("tr").remove();
			$.ajax({
				url:"/XoaSanPham",
			    type:"GET",
			    data:{
			    	masp:masanpham,
			    	
			    },
				success: function(value){
					This.closest("tr").remove();
				}
			})
		})
	})
	
	var files = [];
	var tenhinh = "";
	$("#hinhanh").change(function(event){
		files = event.target.files;
		tenhinh = files[0].name;
		forms = new FormData();
		forms.append("file",files[0]);
		
		$.ajax({
			url:"/minishop/api/UploadFile",
		    type:"POST",
		    data:forms,
		    contentType:false,
		    processData:false,
		    enctype: "multipart/form-data",
			success: function(value){
				
			}
		})
		
	})
	
	$("body").on("click",".btn-chitiet",function(){
		$(this).remove();
		var chitietclone = $("#chitietsanpham").clone().removeAttr("id");
		$("#containerchitietsanpham").append(chitietclone);
	})
	
	$("#btnThemSanPham").click(function(event){
		event.preventDefault();
		var formdata = $("#form-sanpham").serializeArray();
		json = {};
		arraychitiet = [];
		
		 $.each(formdata, function(i, field){
			 json[field.name]   = field.value;   		 
		 });
		
		 $("#containerchitietsanpham >.chitietsanpham").each(function(){
			 objectChitiet = {};
			 mausanpham = $(this).find('select[name="mausanpham"]').val();
			 sizesanpham = $(this).find('select[name="sizesanpham"]').val()
			 soluong = $(this).find('input[name="soluong"]').val();
			 
			 
			 objectChitiet["mausanpham"] = mausanpham;
			 objectChitiet["sizesanpham"] = sizesanpham;
			 objectChitiet["soluong"] = soluong;
			 
			 arraychitiet.push(objectChitiet);
		 })
		 
		 json["chitietsanpham"] = arraychitiet;
		 json["hinhsanpham"] = tenhinh;

		 
		 $.ajax({
				url:"/minishop/api/themsanpham",
			    type:"POST",
			    data:{
			    	dataJson: JSON.stringify(json)
			    },
				success: function(value){
					
				}
			})
		 
	})
	
	$("#btnCapNhatSanPham").click(function(event){
		event.preventDefault();
		var formdata = $("#form-sanpham").serializeArray();
		json = {};
		arraychitiet = [];
		
		 $.each(formdata, function(i, field){
			 json[field.name]   = field.value;   		 
		 });
		
		 $("#containerchitietsanpham >.chitietsanpham").each(function(){
			 objectChitiet = {};
			 mausanpham = $(this).find('select[name="mausanpham"]').val();
			 sizesanpham = $(this).find('select[name="sizesanpham"]').val()
			 soluong = $(this).find('input[name="soluong"]').val();
			 
			 
			 objectChitiet["mausanpham"] = mausanpham;
			 objectChitiet["sizesanpham"] = sizesanpham;
			 objectChitiet["soluong"] = soluong;
			 
			 arraychitiet.push(objectChitiet);
		 })
		 
		 json["masanpham"] = masanpham;
		 json["chitietsanpham"] = arraychitiet;
		 json["hinhsanpham"] = tenhinh;
		 
		 
		 $.ajax({
				url:"/minishop/api/capnhatsanpham",
			    type:"POST",
			    data:{
			    	dataJson: JSON.stringify(json)
			    },
				success: function(value){
					
				}
			})
	})
	
	$("body").on("click",".capnhatsanpham",function(){
		masanpham = $(this).attr("data-id");

		$("#btnCapNhatSanPham").removeClass("hidden");
		$("#btnThoat").removeClass("hidden");
		$("#btnThemSanPham").addClass("hidden");
		
		$.ajax({
			url:"/minishop/api/LayDanhSachSanPhamTheoMa",
		    type:"POST",
		    data:{
		    	masanpham: masanpham
		    },
			success: function(value){
				
				$("#tensanpham").val(value.tensanpham);
				$("#giatien").val(value.giatien);
				$("#mota").val(value.mota);
				if(value.gianhcho === "nam"){
					$("#rd-nam").prop("checked",true);
				}else{
					$("#rd-nu").prop("checked",true);
				}
				
				$("#danhmucsanpham").val(value.danhmucsanpham.madanhmuc);
				
				$("#containerchitietsanpham").html("");
				
				var countchitiet = value.chitietsanpham.length;
				for(i=0; i<countchitiet;i++){
					var chitietclone = $("#chitietsanpham").clone().removeAttr("id");
					
					if(i < countchitiet - 1){
						chitietclone.find(".btn-chitiet").remove();
					}
					
					chitietclone.find("#mausanpham").val(value.chitietsanpham[i].mausanpham.mamau);
					chitietclone.find("#sizesanpham").val(value.chitietsanpham[i].sizesanpham.masize);
					chitietclone.find("#soluong").val(value.chitietsanpham[i].soluong);
					$("#containerchitietsanpham").append(chitietclone);
				}
				
				
			}
		})
	})
	
})
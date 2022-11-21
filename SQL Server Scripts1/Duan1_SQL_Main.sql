create database DUAN1_Main
go
use DUAN1_Main
go


IF OBJECT_ID ('TRANGTHAISANPHAM') IS NOT NULL  
DROP TABLE TRANGTHAISANPHAM;  
GO 
create table TRANGTHAISANPHAM 
(
	Idtt int primary key,
	TenTrangThai nvarchar(100) not null,

);
IF OBJECT_ID ('THELOAI') IS NOT NULL  
DROP TABLE THELOAI;  
GO 
create table THELOAI
(
	IdTheLoai varchar(10) primary key,
	TenTheLoai nvarchar(100) not null
);
IF OBJECT_ID ('NHANHIEU') IS NOT NULL  
DROP TABLE NHANHIEU;  
GO 
create table NHANHIEU
(
	IdNhanHieu varchar(10) primary key,
	TenNhanHieu nvarchar(100) not null,
);
IF OBJECT_ID ('SANPHAM') IS NOT NULL  
DROP TABLE SANPHAM;  
GO 
create table SANPHAM
(
	IdSp varchar(10) primary key,
	TenSp nvarchar(100) not null,
	NgayNhap date,
	Idtt int,
	IdNhanHieu varchar(10) not null,
	MauSac nvarchar(30) not null,
	KichCo varchar(10) not null,
	GiaBan float not null,
	NgaySanXuat date,
	SoLuong int not null,
	foreign key (Idtt) references TRANGTHAISANPHAM(Idtt),
	foreign key ( IdNhanHieu ) references NHANHIEU ( IdNhanHieu)
);
insert into SANPHAM(IdSp,TenSp,NgayNhap,Idtt,IdNhanHieu,MauSac,KichCo,GiaBan,NgaySanXuat,SoLuong) values
				('Sp6',N'Quần đùi','2022-10-12',1,'NH1',N'Đỏ','S','100000','2022-09-10',100)
insert into SANPHAM(IdSp,TenSp,NgayNhap,Idtt,IdNhanHieu,MauSac,KichCo,GiaBan,NgaySanXuat,SoLuong) values
				('Sp2',N'Áo Thun','2022-11-12',2,'NH2',N'Trắng','M','100000','2022-09-10',100)
insert into SANPHAM(IdSp,TenSp,NgayNhap,Idtt,IdNhanHieu,MauSac,KichCo,GiaBan,NgaySanXuat,SoLuong) values
				('Sp5',N'Quần Âu','2022-10-12',1,'NH1',N'Đen','L','100000','2022-09-10',100)
select SANPHAM.IdSp,TenSp,NgayNhap,Idtt,IdNhanHieu,MauSac,KichCo,GiaBan,NgaySanXuat,SoLuong from SANPHAM
IF OBJECT_ID ('NGUOIDUNG') IS NOT NULL  
DROP TABLE NGUOIDUNG;  
GO 
create table CHITIETSANPHAM
(
	IdChiTietSanPham varchar(10) primary key,
	IdSp varchar(10) not null,
	IdTheLoai varchar(10) not null,
	TenSp nvarchar(100) not null,
	SoLuong int not null,
	GiaBan float not null,
	MauSac nvarchar(100),
	KichCo nvarchar(100),
	constraint fk_sp foreign key ( IdSp ) references SANPHAM ( IdSp ),
	constraint fk_tl foreign key ( IdTheLoai ) references THELOAI ( IdTheLoai ),
);

IF OBJECT_ID ('TRANGTHAI') IS NOT NULL  
DROP TABLE TRANGTHAI;  
GO 
create table TRANGTHAI
(
	IdTrangThai varchar(10) primary key,
	TenTrangThai nvarchar(100) not null,
);
IF OBJECT_ID ('NHANVIEN') IS NOT NULL  
DROP TABLE NHANVIEN;  
GO 
create table NHANVIEN 
(
	IdNhanVien varchar(10) primary key,
	MaNV varchar(10) not null unique,
	TenNV nvarchar(100),
	NgaySinh datetime,
	Email varchar(100) not null,
	SDT varchar(100) not null,
	DiaChi nvarchar(100),
	IdTrangThai varchar(10) not null ,
	ChucVu nvarchar(100),
	GioiTinh nvarchar(10),
	TK varchar(100) not null,
	MK varchar(100) not null,
	constraint fk_tt foreign key (IdTrangThai) references TRANGTHAI( IdTrangThai)
);
IF OBJECT_ID ('NGUOIDUNG') IS NOT NULL  
DROP TABLE NGUOIDUNG;  
GO 
create table NGUOIDUNG
(
	IdNguoiDung varchar(10) primary key,
	TenND nvarchar(100),
	NgaySinh datetime,
	Email varchar(100) not null,
	SDT varchar(100) not null,
	DiaChi nvarchar(100),
	GioiTinh nvarchar(10),
	TK varchar(100),
	MK varchar(100)
);
IF OBJECT_ID ('HOADON') IS NOT NULL  
DROP TABLE HOADON;  
GO 
create table HOADON 
(
	IDHD varchar(10) primary key,
	IdSp varchar(10) not null,
	TenSp nvarchar(100),
	IdNhanVien varchar(10),
	IdNguoiDung varchar(10),
	NgayTao datetime,
	DiaChi nvarchar(100),
	ThanhToan nvarchar(100),
	constraint fk_nv foreign key ( IdNhanVien ) references NHANVIEN ( IdNhanVien),
	constraint fk_nd foreign key (IdNguoiDung ) references NGUOIDUNG ( IdNguoiDung),
);
IF OBJECT_ID ('CHITIETHOADON') IS NOT NULL  
DROP TABLE CHITIETHOADON;  
GO 
create table CHITIETHOADON 
(
	IDHDCT varchar(10) primary key,
	IDHD varchar(10),
	TenSP nvarchar(100),
	DonGia float,
	SoLuong int,
	constraint fk_hd foreign key ( IDHD ) references HOADON ( IDHD )
);
IF OBJECT_ID ('ROLEACC') IS NOT NULL  
DROP TABLE ROLEACC;  
GO 
create table ROLEACC(
		IdRole int primary key,
		NameRole varchar(100)
	);
	insert into ROLEACC values (0,'admin')
	insert into ROLEACC values (1,'nhan vien')
	insert into ROLEACC values (2,'khach hang')


IF OBJECT_ID ('ACCOUNT') IS NOT NULL  
DROP TABLE ACCOUNT;  
GO 
create table ACCOUNT 
(	
	TK varchar(100) primary key,
	MK varchar(100),
	Email nvarchar(100),
	ROLEACC int DEFAULT 1,
	constraint fk_role foreign key ( ROLEACC ) references ROLEACC ( IdRole )
);

	insert into account values ('admin','admin','admin',0)
	insert into account values ('nhanvien','nhanvien','nhanvien',1)
 insert into TRANGTHAISANPHAM(Idtt,TenTrangThai) values ('1','còn hàng'),('2','hết hàng')
 insert into NGUOIDUNG(IdNguoiDung,Email,SDT) values ('ND1','nd1@gmail.com','023456781'),('ND2','nd1@gmail.com','023456781'),('ND3','nd1@gmail.com','023456781')
 insert into NHANHIEU(IdNhanHieu,TenNhanHieu) values('NH1','Adidas'),('NH2','Dior')
 insert into TRANGTHAI(IdTrangThai,TenTrangThai) values ('1',N'Tốt'),('2',N'Bình thường')

insert into NHANVIEN(IdNhanVien,MaNV,TenNV,NgaySinh,Email,SDT,DiaChi,IdTrangThai,ChucVu,GioiTinh,TK,MK) values 
					('NV2','012',N'Phạm Quốc Đạt','2003-08-10','datpq@gmail.com','0982023282','Thanh Hoa','1',N'Nhân Viên',N'Nam','dat123','dat123')
insert into HOADON(IDHD,IdSp,TenSp,IdNhanVien,IdNguoiDung,NgayTao,DiaChi,ThanhToan) values
					('HD05','Sp1',N'Áo thun','NV1','ND1','2022-11-12',N'Hà Nội',N'Đã thanh toán')
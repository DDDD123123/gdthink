var ListNtc = [];
var recordSize  = 3; // 한 페이지당 보여줄 게시물의 개수
var blockSize   = 5; // 페이지 블럭
var totPageNum  = 0; // 총 페이지 수
var curPageNum  = 0; // 현재 페이지
var sBtnNum     = 0; // 시작 버튼 숫자
var btnPageNext = null;
var totCnt      = 0;

const getTransPageNm = (str) => {
	const nt0001 = 'hr-project'
	const nt0002 = 'si-project'
	const nt0003 = 'sol-project'
	
	const obj = {
		nt0001,
		nt0002,
		nt0003
	}
	return obj[str.toLowerCase()];
}

const getTransNoticeCd = (str) => {
	const nt0001 = 'HR'
	const nt0002 = 'SI'
	const nt0003 = 'SP'
	
	const obj = {
		nt0001,
		nt0002,
		nt0003
	}
	return obj[str.toLowerCase()];
}

// 게시판 목록 10개 단위 출력
const setPageList = (obj, sNum = 0, eNum = recordSize) => {
	let tbody = document.querySelector('tbody');
	
	tbody.innerHTML = '';
	let txtTotalCnt = document.querySelector('#total_cnt');
	var list = obj.data.slice(sNum, eNum);
	var html = '';
	list.forEach(function(el, idx){
			html += `<tr>`;
			html += `    <td id="ntc_id" align="center">${el.noticeId}</td>`;
			html += `    <td id="ntc_title" align="left">${el.title}</td>`;
			html += `    <td id="ntc_regNm" align="center">${el.regNm}</td>`;
			html += `    <td id="ntc_regDt" align="center">${el.regDt}</td>`;
			html += `    <td id="ntc_regViews" align="center">${el.views}</td>`;
			html += `    <td id="ntc_rNum" align="center" hidden>${el.rNum}</td>`;
			html += `</tr>`;
	});
	if (list.length < 1) {
		html = `<tr><td colspan="5" align="center">등록된 글이 없습니다.</td></tr>`;
	}
	tbody.insertAdjacentHTML('beforeend', html);
	txtTotalCnt.innerHTML = totCnt;
	
	const tr = document.querySelectorAll('tr');
	tr.forEach(function(el){
		el.addEventListener('click', function() {
			const ntcId = this.querySelector('#ntc_rNum').textContent;
			window.location.href = `/project/detailNotice?noticeGb=${noticeGb}&noticeId=${ntcId}`;
		})
	});
}

// 페이지네비 세팅
const setPageNavi = (totCnt, curPageNum = 1) => {
	curPageNum = curPageNum // 현재 페이지 넘버
	totPageNum = Math.ceil(totCnt / recordSize);
	sBtnNum = (Math.ceil(curPageNum / blockSize) - 1) * blockSize + 1 // 시작 페이지 넘버
	var html = `<li class="page-item"><a class="page-link page-prev" href="javascript:void(0);" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>`;
	for (let i = sBtnNum; i < sBtnNum + blockSize; i++) {
		if (i > totPageNum) {
			break;
		}
		html += `<li class="page-item"><a class="page-link page-linkNum ${curPageNum == i ? ' active' : ''}" href="javascript:void(0);" data=${i}>${i}</a></li>`;
	}
	html += `<li class="page-item"><a class="page-link page-next" href="javascript:void(0);" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>`;
	
	document.querySelector('.pagination').innerHTML = html;
	
	const pageLinkNum = document.querySelectorAll('.page-linkNum');
	pageLinkNum.forEach(function(el){		
		el.addEventListener('click', function() {
			clickPageNum(this.innerHTML);
		})
	});
	
	btnPageNext = document.querySelector('.page-next');
	btnPageNext.addEventListener('click', () => {
		const nextSnum = sBtnNum + blockSize;
		const eNum = nextSnum * recordSize;
		const sNum = eNum - recordSize;
		if (totPageNum < nextSnum) {
			return;
		}
		setPageList(ListNtc, sNum, eNum);
		setPageNavi(totCnt, nextSnum);
	});
	
	btnPpagePrev = document.querySelector('.page-prev');
	btnPpagePrev.addEventListener('click', () => {
		const prevSnum = sBtnNum - blockSize;
		const eNum = prevSnum * recordSize;
		const sNum = eNum - recordSize;
		if (1 > prevSnum) {
			return;
		}
		setPageList(ListNtc, sNum, eNum);
		setPageNavi(totCnt, prevSnum);
	});
}

// 선택한 숫자의 페이지로 이동
const clickPageNum = (curNum) => {
	const eNum = parseInt(curNum) * recordSize;
	const sNum = eNum - recordSize;
	setPageList(ListNtc, sNum, eNum);
	setPageNavi(totCnt, curNum);
}

// 게시판 진입 시 리스트 초기화
const initList = (noticeGb) => {
	fetch(`/project/ntcList?sCodeNm=${noticeGb}`)
	.then(res => {
		return res.json();
	})
	.then(res => {
		if (res.status == 'OK') {
			ListNtc = res;
			totCnt = ListNtc.data.length;
			if (totCnt > 0) {
				setPageNavi(totCnt);
				setPageList(ListNtc);
			}
		}
	})
	.catch((err) => {
		console.log(err.message);
	});
}
		
// 검색
const getSrchList = () => {
	const txtSrch = document.querySelector('#txtSrch').value;
	const srchtype  = document.querySelector('#srchtype').value;
	
	fetch("/project/getSrchList", {
	  method: "POST",
	  headers: {
        'Content-Type': 'application/json',
        'Access-Control-Allow-Origin': '*',
      },
	  body: JSON.stringify({
		'sCodeNm' : noticeGb,
		 txtSrch,
		 srchtype
	  }),
	})
	.then((res) => {
		return res.json();
	})
	.then((res) => {
		if (res.status == 'OK') {
			ListNtc = res;
			totCnt = ListNtc.data.length;
			setPageNavi(totCnt);
			setPageList(ListNtc);
		}
	})
	.catch((err) => {
		console.log(err.message);
	});
}
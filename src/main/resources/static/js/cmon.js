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
const setPageList = (obj, sNum = 0, eNum = 10) => {
	let tbody = document.querySelector('tbody');
	let totalCnt = document.querySelector('#total_cnt');
	tbody.innerHTML = '';
	
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
	totalCnt.innerHTML = list.length;
	
	const tr = document.querySelectorAll('tr');
	tr.forEach(function(el){
		el.addEventListener('click', function() {
			const ntcId = this.querySelector('#ntc_rNum').textContent;
			window.location.href = `/project/detailNotice?noticeGb=${noticeGb}&noticeId=${ntcId}`;
		})
	});
}

// 페이지네비 세팅
const setPageNavi = (totPageNum, curPageNum = 1) => {
	var recordSize = 10;                                // 한 페이지당 보여줄 게시물의 개수
	var totPageNum = Math.ceil(totPageNum / recordSize) // 페이징 총 개수
	var curPageNum = curPageNum                         // 현재 페이지 넘버
	var blockSize  = 5;                                 // 페이지 블럭
	var sBtnNum    = (Math.ceil(curPageNum / blockSize) - 1) * blockSize + 1 // 시작 페이지 넘버
	var html = '';
	for (let i = sBtnNum; i < sBtnNum + 5; i++) {
		html += `<li class="page-item"><a class="page-link page-linkNum" href="javascript:void(0);" data=${i}>${i}</a></li>`;
		if (i == totPageNum) {
			break;
		}
	}
	document.querySelector('.page-item').insertAdjacentHTML('afterend',html);
	
	const pageLinkNum = document.querySelectorAll('.page-linkNum');
	pageLinkNum.forEach(function(el){		
		el.addEventListener('click', function() {
			setActive(this);
		})
	});
}
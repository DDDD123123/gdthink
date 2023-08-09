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

const getTransNoticeNm = (str) => {
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